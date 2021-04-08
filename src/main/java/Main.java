public class Main {
  public static void main(String[] args) {
    MLimitedSet<Integer> mLimitedSet = new MLimitedSet();
    mLimitedSet.add(1);
    mLimitedSet.add(2);
    mLimitedSet.add(3);
    mLimitedSet.add(4);
    mLimitedSet.add(5);
    mLimitedSet.add(6);
    mLimitedSet.add(7);
    mLimitedSet.add(8);
    mLimitedSet.add(9);
    mLimitedSet.add(10);
    System.out.println(mLimitedSet.contains(10));
    System.out.println(mLimitedSet.contains(12));
    mLimitedSet.add(11);
    System.out.println(mLimitedSet);
    mLimitedSet.remove(5);
    System.out.println(mLimitedSet);
  }
}
