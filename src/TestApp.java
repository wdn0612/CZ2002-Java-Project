import java.util.ArrayList;
public class TestApp {
	
	public static void main(String[] args) {
		
		courseStructure structure=new courseStructure(0.6,0.0,0.2,0.2,0.0);
		courseComponent component=new courseComponent(true,true,false);
		ArrayList<Integer> indexGroupList=new ArrayList<Integer>(3);
		indexGroupList.add(2);
		indexGroupList.add(4);
		indexGroupList.add(7);
		Integer AUCredits=3;
		//System.out.println(AUcredits);

		Course course1=new Course("CZ2002","OOP",AUCredits,"SCSE","Core",indexGroupList,structure,component);
       
		course1.viewCourseInfo(AUCredits,structure, component);  // ????????????
	}
}
