
public class OracleSqlProvider implements ISqlProvider{

	@Override
	public void Add() {
		System.out.println("Oracle Sql eklendi");
	}

	@Override
	public void Delete() {
		System.out.println("Oracle Sql silindi");
	}

	@Override
	public void Update() {
		System.out.println("Oracle Sql gğncellendi");
	}

	@Override
	public void GetAll() {
		System.out.println("Oracle Sql Listelendi");
	}

}
