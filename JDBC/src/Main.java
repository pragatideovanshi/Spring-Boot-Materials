import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import StudentManagement.StudentDao;
import StudentManagement.student;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		System.out.println("Welcome to Student Management App");
		BufferedReader sc = new BufferedReader(
	            new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add Person");
			System.out.println("Press 2 to Delete Person");
			System.out.println("Press 3 to Display Person");
			System.out.println("Press 4 to Display Person by ID");
			System.out.println("Press 5 to Exit");
			 
	        // Integer reading internally
	        int value = Integer.parseInt(sc.readLine());
			if(value==1) {
				System.out.println("Enter User Name");
				String n=sc.readLine(); // ReadLine gives String if u give 5 then it will give "5"
				System.out.println("Enter City");
				String c=sc.readLine();
				System.out.println("Enter Age");
				int a=Integer.parseInt(sc.readLine());
				student st=new student(n,c,a);
				System.out.println(st);
				boolean check= StudentDao.InsertStToDB(st);
				if(check) {
					System.out.println("Added SucessFully!!");
				}
				else {
					System.out.println("Something Went Wrong");
				}
				
			}
			else if(value==2) {
				//Delete Person
				System.out.println("Enter Id to Delete");
				int c=Integer.parseInt(sc.readLine());
				boolean check=StudentDao.DeleteToDB(c);
				if(check) {
					System.out.println("Deleted SucessFully!!");
				}
				else {
					System.out.println("Something Went Wrong");
				}
			}
			else if(value ==3) {
				//Display Data
				StudentDao.showdata();
			}
			else if(value==4) {
				System.out.println("Enter ID"); 
				int c=Integer.parseInt(sc.readLine());
				StudentDao.getbyid(c);
			}
			else {
				break;
			}
			}
		}
	}
