import java.sql.*;

public class mysqlTest {

	// jdbc �����������ݿ�URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mytestmysql?useUnicode=true&characterEncoding=utf-8&useSSL=false";

	// ���ݿ���û��������룬��Ҫ�����Լ�
	static final String USER = "root";
	static final String PASS = "ahxuyinglin";

	public void connetMySql() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// ע��JDBC����
			Class.forName(JDBC_DRIVER);

			// ������
			System.out.println("�������ݿ�....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// ��ѯ
			System.out.println("ʵ����Statement");
			stmt = conn.createStatement();
			String Sql;
			Sql = "select * from websites";
			ResultSet rSet = stmt.executeQuery(Sql);
			while (rSet.next()) {
				
				int id=rSet.getInt("id");
				String name=rSet.getString("name");
				String url=rSet.getString("url");
				//�������
				System.out.print("ID��"+id);
				System.out.print(",վ�����ƣ�"+name);
				System.out.print(",url��"+url);
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
