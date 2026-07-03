import java.util.Random;

public  abstract class  Location {
    protected static Random input;
    private Player player;
    private String locationName;


    abstract  boolean onLocaiton ();





    public Location(Player player,String locationName ){
        this.player=player;
        this.locationName=locationName;
    }

    public String getLocationName(){
        return  locationName;
    }

    public void setLocationName(String locationName){
        this.locationName=locationName;
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player){
        this.player=player;
    }























}
