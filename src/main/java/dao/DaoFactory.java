package dao;

public class DaoFactory {
	public static MemberDao createMemberDao() {
		return new MemberDaoImpl();
		}
		public static ItemDao createItemDao() {
		return new ItemDaoImpl();
		}
}
