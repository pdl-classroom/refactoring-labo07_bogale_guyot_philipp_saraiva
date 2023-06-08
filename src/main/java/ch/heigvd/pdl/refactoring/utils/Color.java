package ch.heigvd.pdl.refactoring.utils;

public enum Color {
   BLUE("blue", 1),
   RED("red", 2),
   YELLOW("yellow", 3),
   NO_COLOR("no color", 4);
   private final String name;
   private final int colorId;
   Color(String name, int colorId) {
      this.name = name;
      this.colorId = colorId;
   }

   public String getName() {
      return name;
   }
   public int getColorId() {
      return colorId;
   }

   /**
    * @param id de la couleur
    * @return La couleur correspondante en fonction de l'id passé en paramètre
    */
   public static Color getColorById(int id) {
      return Color.values()[id - 1];
   }

   @Override
   public String toString() {
      return name;
   }
}
