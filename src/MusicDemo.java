public class MusicDemo {
    public static void main(String[] args) {
        Music m1=new Music("Heartless", "R&B", new Date(27,11,2019), 3.18, new Artist("The Weeknd", "Canadian", 4.12), "After Hours");
        Music m2=new Music("Like A Moth To A Flame", "EDM", new Date(22,10,2021), 3.54, new Artist("Axwell", "Sweden", 4.12), "Single");
        Music m3=new Music("Falling", "Pop", new Date(13,2,2019), 2.43, new Artist("Taylor Swift", "American", 4.23), "Single");
        Music m4=new Music("Pasoori", "R&B", new Date(16,2,2022), 2.00, new Artist("Ali Sethi", "Pakistan", 4.0), "Single");
        Music m5=new Music("Pasoori", "Pop", new Date(13,2,2018), 2.23, new Artist("Ali Sethi", "Candian", 4.20), "Single");
        Music m6= Music.takeInput();
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);
//        System.out.println(m1.equals(m2));
//        System.out.println(m4.equals(m5));
        Music list[]= {m1,m2,m3,m4,m5,m6};
        for(Music m:list)
        {
            System.out.println(m);
        }
    }
}
