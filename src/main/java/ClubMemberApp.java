import java.awt.desktop.SystemEventListener;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClubMemberApp {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        SoftwareDeveloperClub softwareDeveloperClub = new SoftwareDeveloperClub();
        ClubMember clubMember = new ClubMember();

        Integer choice = 0;
        while (choice != 4)
        {
            menu();
            choice = reader.nextInt();
            switch (choice)
            {
                case 1:
                    softwareDeveloperClub.display();
                    break;
                case 2:
                    softwareDeveloperClub.display();
                    System.out.println("Enter the member you want to remove");
                    reader.nextLine();
                    String membername = reader.nextLine();
                    if (softwareDeveloperClub.remove(membername) != null)
                    {
                        System.out.println(membername + "was removed from the ClubMemebr");
                    }
                    else
                    {
                        System.out.println("Inavlid name, please try again");
                    }
                    break;
                case 3:
                    ClubMember clubMember1 = new ClubMember();
                    reader.nextLine();
                    System.out.println("Enter the name you want to add");
                    clubMember.setMemberName(reader.nextLine());
                    System.out.println("Enter the city this member located");
                    clubMember.setLocation(reader.nextLine());
                    System.out.println("Enter the state this member at");
                    clubMember.setState(reader.nextLine());
                    System.out.println("Enter the favorite Language of this member");
                    clubMember.setFavoriteLanguage(reader.nextLine());
                    System.out.println(clubMember.getMemberName());
                    if (softwareDeveloperClub.add(clubMember))
                    {
                        System.out.println("Member was added successfully");
                    }
                    else
                    {
                        System.out.println("Try again");
                    }
                    break;
                case 4:
                    System.out.println("\nHave a good day!!!");
                    break;
            }
        }
        reader.close();
    }

        public static void menu(){
            System.out.println("Select from the following menu: ");
            System.out.println("1: Display Members");
            System.out.println("2: Remove Members");
            System.out.println("3: Add Members");
            System.out.println("4: Quit");
            Scanner sc = new Scanner(System.in);
    }
}
