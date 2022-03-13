import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SoftwareDeveloperClub {
    public HashMap<String, ClubMember> memberCollection;

    SoftwareDeveloperClub() throws FileNotFoundException { //we need to create constructor first
        memberCollection = new HashMap<String, ClubMember>();
        FileReader f = new FileReader("src/main/resources/members.txt");
        ArrayList<ClubMember> list = new ArrayList<ClubMember>();
        Scanner sc = new Scanner(f);
        String s = sc.nextLine();
        while (sc.hasNext()) {
            s = sc.nextLine(); //we use this to skip the first line
            String[] content = s.split("\\*\\*"); //* use alone meaning wild character like * in SQL, but if we put\\,meaning just use it as a *,noting else.
            ClubMember clubMember = new ClubMember(content[0], content[1], content[2], content[3]);
            memberCollection.put(clubMember.getMemberName(), clubMember);

        }
        display();
    }

    public ClubMember remove(String membername) {
        if (this.memberCollection.containsKey(membername)) {
            return this.memberCollection.remove(membername);
        }
        return null;
    }

    public Boolean add(ClubMember clubMember) {
        if (clubMember == null)
        {
            return false;
        }
        else if (!this.memberCollection.containsKey(clubMember.getMemberName()))
        {
            this.memberCollection.put(clubMember.getMemberName(), clubMember);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void display() {
        memberCollection.forEach((k, v) -> {
            System.out.println("Member Name: " + v.getMemberName());
            System.out.println("Location: " + v.getLocation() + v.getState());
            System.out.println("Favorite Language: " + v.getFavoriteLanguage());
        });

    }
}
