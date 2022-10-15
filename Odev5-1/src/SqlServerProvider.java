
public class SqlServerProvider implements ISqlProvider{
	@Override
	public void Add() {
		System.out.println("SqlServer eklendi");
	}

	@Override
	public void Delete() {
		System.out.println("SqlServer silindi");
	}

	@Override
	public void Update() {
		System.out.println("SqlServer gğncellendi");
	}

	@Override
	public void GetAll() {
		System.out.println("SqlServer Listelendi");
	}
}
