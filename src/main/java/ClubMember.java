import java.util.ArrayList;

public class ClubMember {
    public String MemberName;
    public String Location;
    public String state;
    public String FavoriteLanguage;

    public ClubMember()
    {

    }

    public ClubMember(String MemberName, String Location, String state, String FavoriteLanguage)
    {
        this.MemberName = MemberName;
        this.Location = Location;
        this.state = state;
        this.FavoriteLanguage = FavoriteLanguage;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFavoriteLanguage() {
        return FavoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        FavoriteLanguage = favoriteLanguage;
    }
}
