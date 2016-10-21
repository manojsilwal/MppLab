package prob_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.midi.ShortMessage;

import java.util.*;

public class EmployeeInfoOK {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(HashMap<SortMethod,Employee> HashMap) {
		Collections.sort(HashMap,(HashMap)->{
			
		});
		//consistency with equals issue heres
		/*Collections.sort(emps, (e1,e2) ->
		{
			if(method == SortMethod.BYNAME) {
				return e1.name.compareTo(e2.name);
			} else {
				if(e1.salary == e2.salary) return 0;
				else if(e1.salary < e2.salary) return -1;
				else return 1;
			}
		});*/
		
		
		//sometimes, the return keyword can be omitted, as in
		//the following
		//Collections.sort(emps, (e1, e2)  ->  e1.name.compareTo(e2.name));
				
	}
	
	public static void main(String[] args) {
		HashMap<SortMethod,Employee> HashMap = new HashMap<SortMethod,Employee>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfoOK ei = new EmployeeInfoOK();
		ei.sort(emps, EmployeeInfoOK.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfoOK.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
