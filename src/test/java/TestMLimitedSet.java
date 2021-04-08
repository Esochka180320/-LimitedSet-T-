import org.junit.Assert;
import org.junit.Test;

public class TestMLimitedSet {
  @Test
  public void addTest() {
    MLimitedSet<Integer> mLimitedSet = new MLimitedSet();
    mLimitedSet.add(4);
    Assert.assertTrue(mLimitedSet.contains(4));
  }

  @Test
  public void removeTest() {
    MLimitedSet<Integer> mLimitedSet = new MLimitedSet();
    mLimitedSet.add(4);
    mLimitedSet.remove(4);
    Assert.assertFalse(mLimitedSet.contains(4));
  }

  @Test
  public void containsTest() {
    MLimitedSet<Integer> mLimitedSet = new MLimitedSet();
    mLimitedSet.add(4);
    Assert.assertTrue(mLimitedSet.contains(4));
  }
}
