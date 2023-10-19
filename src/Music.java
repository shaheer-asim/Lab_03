import java.util.Scanner;

public class Music{
    private String title;
    private String genre;
    private Date releaseDate;
    private double duration;
    private Artist artist;
    private String album;
    public Music(String title,String genre,Date releaseDate,double duration,Artist artist,String album)
    {
        this.title=title;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.duration=duration;
        this.artist=artist;
        this.album=album;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
    public String getGenre()
    {
        return this.genre;
    }
    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate=releaseDate;
    }
    public Date getReleaseDate()
    {
        return this.releaseDate;
    }
    public void setDuration(double duration)
    {
        this.duration=duration;
    }
    public double getDuration()
    {
        return this.duration;
    }
    public void setArtist(Artist artist)
    {
        this.artist=artist;
    }
    public Artist getArtist()
    {
        return this.artist;
    }
    public void setAlbum(String album)
    {
        this.album=album;
    }
    public String getAlbum()
    {
        return this.album;
    }
    public String toString()
    {
        return String.format("%-25s %-7s %-12s %4.2f  %34s  %-15s",title,genre,releaseDate,duration,artist,album);
    }
    public boolean equals(Object o)
    {
        Music m= (Music) o;
        if((m.getTitle().equals(this.title))&&(m.artist.getName().equals(this.artist.getName())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static Music takeInput()
    {
        Scanner sc= new Scanner(System.in);
        String title;
        String genre;
        int day;
        int month;
        int year;
        double duration;
        String artistName;
        String artistNationality;
        double rating;
        String album;
        System.out.print("Enter The Title Of Song: ");
        title=sc.nextLine();
        System.out.print("Enter Genre: ");
        genre=sc.nextLine();
        System.out.print("Enter Release Day: ");
        day=sc.nextInt();
        System.out.print("Enter Release Month: ");
        month=sc.nextInt();
        System.out.print("Enter Release Year: ");
        year=sc.nextInt();
        System.out.print("Enter Duaration: ");
        duration=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Artist Name: ");
        artistName=sc.nextLine();
        System.out.print("Enter Nationality: ");
        artistNationality=sc.nextLine();
        System.out.print("Enter Rating Of Artist: ");
        rating=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Album Name:");
        album=sc.nextLine();
        sc.close();
        Music song =new Music(title,genre,new Date(day,month,year),duration,new Artist(artistName,artistNationality,rating),album);
        return song;
    }
}