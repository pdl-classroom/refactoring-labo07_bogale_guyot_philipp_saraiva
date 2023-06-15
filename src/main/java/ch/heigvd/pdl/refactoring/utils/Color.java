package ch.heigvd.pdl.refactoring.utils;

public enum Color {
   BLUE("blue"),
   RED("red"),
   YELLOW("yellow"),
   NO_COLOR("no color");
   private final String name;

   Color(String name) {
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
