package ch.heigvd.pdl.refactoring.utils;
public enum Size {
   XS("XS", 1),
   S("S", 2),
   M("M", 3),
   L("L", 4),
   XL("XL", 5),
   XXL("XXL", 6),
   INVALID_SIZE("Invalid Size", -1);

   private final String name;
   private final int sizeId;
   Size(String name, int sizeId) {
      this.name = name;
      this.sizeId = sizeId;
   }

   public String getName() {
      return name;
   }

   public int getSizeId() {
      return sizeId;
   }

   public static Size getSizeById(int id) {
      return Size.values()[id - 1];
   }

   @Override
   public String toString() {
      return name;
   }
}
