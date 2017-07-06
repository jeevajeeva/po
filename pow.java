# po
public long count(long m, int pow) {
  long result = 1;
  for(int i = 0;i<pow; i++) {
    result*=m +1;
  }
  return result;
}
