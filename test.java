class test {
    public static void main(String[] args) {
        int door[] = new int [100];
        int n = 0;
        
        System.out.println("0: Locked \n1: Unlocked \n");
        
        //Assigning all the door with the value 0
        for (int i = 0;i < 100;i++) {
            door[i] = 0;
        }
        
        //Changing the status of each door for each multiples of an iterator
        for (int i = 0;i < 100;i++) {
            for (int j = i;j < 100;j = j + i + 1) {
                door[j] = key(door[j]);
            }
        }
        
        //Printing the status of each door
        for (int i = 0;i < 10;i++) {
            for (int j = 0;j < 10;j++) {
                System.out.print((n+1)+": "+door[n]+" ");
                n++;
            }
            System.out.println();
        }
    }
    
    //This function acts as a switch which changes the status of the door
    public static int key(int lock) {
        if(lock == 0) {
            lock = 1;
        }
        else {
            lock = 0;
        }
        return (lock);
    }
}
