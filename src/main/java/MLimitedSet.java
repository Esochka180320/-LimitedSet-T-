
import java.util.HashMap;
import java.util.Map;

public class MLimitedSet<T> implements LimitedSet<T> {
  Map<T, Integer> map;

  public MLimitedSet() {
    this.map = new HashMap<>();
  }

  @Override
  public void add(T t) {
    if (this.map.keySet().size()>9){
      int min = this.map.values().stream().mapToInt(x-> x).min().getAsInt();
      T key = this.map.entrySet()
              .stream()
              .filter(entry -> min==entry.getValue())
              .map(Map.Entry::getKey).findFirst().get();
      remove(key);
    }
    this.map.put(t, 0);
  }

  @Override
  public boolean remove(T t) {
    return this.map.remove(t) != null;
  }

  @Override
  public boolean contains(T t) {
    if (this.map.containsKey(t)) {
      this.map.put(t, this.map.get(t)+1);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "" + map.keySet();
  }
}
