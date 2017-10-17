import java.sql.*;

public class mysqlTest {

	// jdbc 驱动名及数据库URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mytestmysql?useUnicode=true&characterEncoding=utf-8&useSSL=false";

	// 数据库的用户名与密码，需要根据自己
	static final String USER = "root";
	static final String PASS = "ahxuyinglin";

	public void connetMySql() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 注册JDBC驱动
			Class.forName(JDBC_DRIVER);

			// 打开链接
			System.out.println("连接数据库....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// 查询
			System.out.println("实例化Statement");
			stmt = conn.createStatement();
			String Sql;
			Sql = "select * from websites";
			ResultSet rSet = stmt.executeQuery(Sql);
			while (rSet.next()) {
				
				int id=rSet.getInt("id");
				String name=rSet.getString("name");
				String url=rSet.getString("url");
				//输出数据
				System.out.print("ID："+id);
				System.out.print(",站点名称："+name);
				System.out.print(",url："+url);
				System.out.print("\n");			
			}
			rSet.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			se.printStackTrace();
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			 try {
				if(stmt!=null) stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			 try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		System.out.println("Goodbye!");
	}

}
