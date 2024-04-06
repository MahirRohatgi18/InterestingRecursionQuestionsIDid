public class TowerOfHanoi {
    public static void main(String[] args) {
        int n =1; // no of disks
        tower(n,"S","H","D");
    }

    public static void tower(int n ,String s, String h , String d ){
        // |   |   |
        // |   |   |
        // s   h   d

        // disks are numbered as 1,2,3 with 3 being the bottom most , 1 being top


        // s is source
        // h is helper
        // d is destination

        // base case
        // if only one disc then just transfer from source to dest
        if (n==1){
            System.out.println("transfer disc:" + n + " from "+s+ " to " + d);
            return;
        }


        // first step is to put n-1 disks into helper , so that last disk n is left at source
        tower(n-1,s,d,h);
        // now first disc is left at source , so we transfer it from source to destination
        System.out.println("transfer disc:" + n + " from "+s+ " to " + d);

        // now we move the n-1 disks to destination using source as helper
        tower(n-1,h,s,d);


    }
}
