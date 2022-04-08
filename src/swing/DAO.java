package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class DAO {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/javagreen11";
	String user = "root";
	String password = "1234";
	String sql = "";
	VO vo = new VO();
	
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
		}catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}
	}
	
	public void connClose() {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
		}
	}
	
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
		}
	}
	
	public void rsClose() {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
		}
	}
	
	public Vector list() {
		Vector vdata = new Vector();
		sql = "select * from game order by idx";
		try {
			pstmt = conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("id"));
				vo.add(rs.getString("pwd"));
				vo.add(rs.getString("mail"));
				vo.add(rs.getString("champ"));
				vo.add(rs.getInt("win"));
				vo.add(rs.getInt("lose"));
				vdata.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			rsClose();
		}
		return vdata;
	}
	
	//로그인
	public VO login(String id, String pwd) {
//		VO vo = new VO();
		sql = "select * from game where id=? and pwd=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setChamp(rs.getString("champ"));
				vo.setWin(rs.getInt("win"));
				vo.setLose(rs.getInt("lose"));
				
			}
		} catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
		
	}
	
	
	
	//회원가입
	public void signup(VO vo) {
		sql = "insert into game values (default,?,?,?,default,default,default)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getMail());
			pstmt.executeUpdate();		
		} catch (SQLException e) {
			System.out.println("sql오류"+e.getMessage());
		}finally {
			pstmtClose();
		}
	}
	
	//회원가입 중복검색
	public VO searchid(String id) {
		VO vo = new VO();
		sql = "select id from game where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id"));
			}
			
		} catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//회원가입 idx검색
//	public VO search(VO vo) {
////	VO vo = new VO();
//	sql = "select * from game where idx=?";
//	try {
//		pstmt = conn.prepareStatement(sql);
//		pstmt.setInt(1, vo.getIdx());
//		rs = pstmt.executeQuery();
//		if(rs.next()) {
//			vo.setId(rs.getString("id"));
//			vo.setPwd(rs.getString("pwd"));
//			vo.setMail(rs.getString("mail"));
//		}
//	} catch (SQLException e) {
//		System.out.println("sql오류" + e.getMessage());
//	}finally {
//		rsClose();
//	}
//	return vo;
//}
	
	
	//아이디 검색
	public Vector getSearch(String mail) {
		Vector vdata = new Vector();
		sql = "select * from game where mail = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mail);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("id"));
				vo.add(rs.getString("pwd"));
				vo.add(rs.getString("mail"));
				vdata.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			rsClose();
		}
		return vdata;
	}
	
	
	
	//메인게임 승리카운트
	public void vic(VO vo) {
		sql = "update game set win = ? where id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getWin());
			pstmt.setString(2, vo.getId());
			pstmt.executeUpdate();
		}  catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			pstmtClose();
		}
	}
		
		//메인게임 루즈카운트
		public void lose(VO vo) {
			sql = "update game set lose = ? where id = ? ";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getLose());
				pstmt.setString(2, vo.getId());
				pstmt.executeUpdate();
			}  catch (SQLException e) {
				System.out.println("sql오류" + e.getMessage());
			}finally {
				pstmtClose();
			}
		}
				
	
	//카드저장
	public void addcard(VO vo) {
		sql = "update game set champ = ? where id= ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getChamp());
			pstmt.setString(2, vo.getId());
			pstmt.executeUpdate();
		}  catch (SQLException e) {
			System.out.println("sql오류" + e.getMessage());
		}finally {
			pstmtClose();
		}
	}		
		//회원삭제
		public void delete(String id) {
			try {
				sql = "delete from game where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("sql오류" + e.getMessage());
			}finally {
				pstmtClose();
			}
		}
	
		
	
	//메인화면 아이디창
//	public VO myid(String id) {
//		sql = "select id from game where = ?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				vo.setId(rs.getString(id));
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("sql오류" + e.getMessage());
//		}finally {
//			rsClose();
//		}
//		return vo;
	}


