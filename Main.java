class Main {
  public static void main(String[] args) {

    //4! = 4 * 3 * 2 * 1 = 24

    int targetFacNum = 4;
    System.out.println(targetFacNum + " factorial result: ");
    System.out.print(fac(targetFacNum));
  }

  public static int fac(int num){
    if(num < 0)
      return -1;
    else if(num == 0)
      return 1;
    else
      return (num * fac(num -1));
  }

}