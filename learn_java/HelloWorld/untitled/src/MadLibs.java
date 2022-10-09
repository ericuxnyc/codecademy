public class MadLibs {
    /*
  This program generates a madlib story
  */
    public static void main(String[] args){
        String name1 = "Eric";
        String adjective1 = "runny";
        String adjective2 = "sleepy";
        String noun1 = "apples";
        String noun2 = "monkeys";
        String verb1 = "run";
        String noun3 = "birds";
        String noun4 = "truck";
        String adjective3 = "happy";
        String name2 = "Mary";
        String place1 = "Paris";
        String noun5 = "Cakes";
        int number = 12;
        String noun6 = "foxes";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
