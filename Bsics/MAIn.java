import java.util.ArrayList;

class MAIn{
 public static void main(String[] args) {
    Continent Asia=new Continent();
    Asia.setCname("Asia");
 }

}

class Continent{
    private String cname;
    private long population;
    private ArrayList<Country> countrylist = new ArrayList<>();
    public String getCname() {
        return cname;
    }
    public long getPopulation() {
        return population;  
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    
    void setcountrylist(Country con){
        countrylist.add(con);
    }

    void calculatePopulation(){
        for(int i=0 ; i<countrylist.size();i++ )
        population+=countrylist.get(i).getPopulation();
    }
    
   

}
class Country{
private String contryname;
 private City capital;
private long population;
 ArrayList<City> cityList = new ArrayList<>();

public void setContryname(String contryname) {
    this.contryname = contryname;
}
public void setCapital(City capital) {
    this.capital = capital;
}
public void setPopulation(long population) {
    this.population = population;
}
public String getCountryName(){
    return contryname;
}
public City getCapital(){
    return capital;
}
public long getPopulation(){
    return population;
}

}
class City{
    private String cityname;
    private long population;
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    
    public long getPopulation() {
        return population;
    }
    public String getCityname() {
        return cityname;
    }
}
