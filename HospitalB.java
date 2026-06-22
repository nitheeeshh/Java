package backup.hos;

import java.util.Scanner;

public class HospitalB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        HospitalB h=new HospitalB();
        String pname[]=new String[10];
        String page[]=new String[10];
        String pdis[]=new String[10];
        
        boolean prg=true;
        do{
        System.out.println("- Menu -");
        System.out.println("1.Add Patient Details");
        System.out.println("2.View Patient Details");
        System.out.println("3.Search Patient Details by id");
        System.out.println("4.Update Patient Details by id");
        System.out.println("5.Delete Patient Details by id");
        System.out.println("6.Count total Patients");
        System.out.println("7.Exit");
        System.out.print("\n Enter your choice: ");
        int choice=ss.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println("Enter Patient Name: ");
                String name=sc.nextLine();
                System.out.println("Enter Patient Age: ");
                String age=sc.nextLine();
                System.out.println("Enter Patient Disease: ");
                String dis=sc.nextLine();
                int id=h.add(name,age,dis,pname,pdis,page);
                System.out.println("Patient id: "+id);
            }break;
            case 2:
            {
                for(int i=0;i<pname.length;i++)
                {
                    
                    if(pname[i]==null)
                    {
                        break;
                    }
                        System.out.println(pname[i]);
                        System.out.println(page[i]);
                        System.out.println(pdis[i]);
                        
                    
                }
               
            }break;
            case 3:
            {
                System.out.print("\nEnter Patient id: ");
                int id=ss.nextInt();
                System.out.println(pname[id]);
            }break;
            case 4:
            {
                System.out.print("Patient id for update: ");
                int id=ss.nextInt();
                System.out.print("\nNew Name,Age,Disease: ");
                String name=sc.nextLine();
                pname[id]=name;
            }break;
            case 5:
            {
                System.out.print("Patient id for delete: ");
                int id=sc.nextInt();
                pname[id]=null;
            }break;
            case 6:
            {
                int count=0;
                for(int i=0;i<pname.length;i++)
                {
                    if(pname[i]!=null)
                    {
                        count++;
                    }
                }
                System.out.println("Patient count: "+count);
            }break;
            case 7:
            {
                System.out.println("Exiting......");
               prg=false; 
            }break;
        }
        
        }while(prg);
    }
     public int add(String name,String age,String dis,String pname[],String page[],String pdis[])
    {
        int id=0;
        for(int i=0;i<pname.length;i++)
        {
        if(pname[id]==null)
        {
            pname[id]=name;
            page[id]=age;
            pdis[id]=dis;
            break;
        }
        else
        {
            id++;
        }
        }
        
        return id;
    }
}