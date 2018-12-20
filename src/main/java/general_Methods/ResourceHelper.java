package general_Methods;

public class ResourceHelper {
	public String getResourcePath(String Resourcename) {
		String path = getBaseResourcePath()  + "/src/main/resource/" + Resourcename;
		return path;
	}
	
	public String getBaseResourcePath() {
		String path = System.getProperty("user.dir");
		//System.out.println(path);
		return path;
	}
	
/*	public  InputStream getResourcePathInputStream(String name) throws FileNotFoundException{
		return new FileInputStream(ResourceHelper.getResourcePath(name));
	}
	*/
	
/*	public static void main(String args[]){		
		System.out.println(getBaseResourcePath());
		System.out.println(getResourcePath("config.properties"));
	}*/
	
}
