public class Artist {
    private String name;
    private String nationality;
    private double rating;
    public Artist(String name,String nationality,double rating)
    {
        this.name=name;
        this.nationality=nationality;
        this.rating=rating;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setNationality(String nationality)
    {
        this.nationality=nationality;
    }
    public String getNationality()
    {
        return this.nationality;
    }
    public void setRating(double rating)
    {
        this.rating=rating;
    }
    public double getRating()
    {
        return this.rating;
    }
    public String toString()
    {
        return String.format("%-18s %-10s %4.2f",name,nationality,rating);
    }
}
