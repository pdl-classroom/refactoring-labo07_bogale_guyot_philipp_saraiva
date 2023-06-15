package ch.heigvd.pdl.refactoring.utils;
public enum Size {
   XS("XS"),
   S("S"),
   M("M"),
   L("L"),
   XL("XL"),
   XXL("XXL"),
   INVALID_SIZE("Invalid Size");

   private final String name;
   Size(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return name;
   }
}
