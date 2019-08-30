package tws.DTO;

import org.yaml.snakeyaml.events.Event.ID;

public class EmployeeDTO {
	 private String id;
	    private String name;
	    private int age;
	    private String desc;

	    public EmployeeDTO() {

	    }

	    public void concat() {
	        this.desc=this.name+this.age;
	    }

	    public String getId() {
	        return id;
	    }
        			
	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    	
	    
	    public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		@Override
	    public String toString() {
	        return "Employee{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", age='" + age + '\'' +
	                '}';
	    }
}
