package in.co.dreamsdoor.beans;

public class Statistics {
	private String name;
	private String collation;
	private String nullable;
	private String index_name;
	private String is_visiable;
	
	
	public Statistics(String name, String collation, String nullable, String index_name, String is_visiable) {
//		super();
		this.name = name;
		this.collation = collation;
		this.nullable = nullable;
		this.index_name = index_name;
		this.is_visiable = is_visiable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollation() {
		return collation;
	}
	public void setCollation(String collation) {
		this.collation = collation;
	}
	public String getNullable() {
		return nullable;
	}
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	public String getIndex_name() {
		return index_name;
	}
	public void setIndex_name(String index_name) {
		this.index_name = index_name;
	}
	public String getIs_visiable() {
		return is_visiable;
	}
	public void setIs_visiable(String is_visiable) {
		this.is_visiable = is_visiable;
	}
	

}
