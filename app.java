
class MagicLevel{
  public static void main(String[] args) {
    String value = magicLevel((long)(132651201231L)) == true ?"YES":"NO";
    System.out.println(value);
  }

  static boolean magicLevel(long level){
    return Math.cbrt(level) % 1 == 0;
  }
}
