
public class PostgreSqlProvider implements ISqlProvider{
	@Override
	public void Add() {
		System.out.println("PostgreSql eklendi");
	}

	@Override
	public void Delete() {
		System.out.println("PostgreSql silindi");
	}

	@Override
	public void Update() {
		System.out.println("PostgreSql gğncellendi");
	}

	@Override
	public void GetAll() {
		System.out.println("PostgreSql Listelendi");
	}
}
