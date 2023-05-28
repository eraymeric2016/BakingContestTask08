package week_04;
/*
Task 8: BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and our cookies will be rated by 3 judges.

    Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
    Then also define two other people's final score and determine which place you earned int the baking contest

        you can earn either: First place, Second place, or Third place

        Ex:
            input:
                your score = 8.5, 7.9, 8.3
                other people score = 8.5 and 7.9

                output: Congratulations you earned Second place with a score of: 8.2
                    -> don't worry about decimal formatting
 */
/*
Kurabiyeleriniz için 3 puan belirleyen bir program oluşturun. Kazandığınız ortalama puanı hesaplayın.
Ardından, diğer iki kişinin son puanını da belirleyin ve pişirme yarışmasında hangi yeri kazandığınızı belirleyin.

    İlk yer, İkinci yer veya Üçüncü yer kazanabilirsiniz.

    Ör:
        girdi:
            senin puanların = 8.5, 7.9, 8.3
            diğer kişilerin puanları = 8.5 ve 7.9

            çıktı: Tebrikler, 8.2 puanla İkinci yer kazandınız
                -> ondalık sayı biçimlendirmeyle ilgilenmeyin

 */
public class BakingContestTask08 {
    public static void main(String[] args) {

        double myscore1 = 8.5, myscore2 = 7.9, myscore3 = 8.3;
        double scoreAverage = (myscore1 + myscore2 + myscore3) / 3;
        System.out.println("scoreAverage = " + scoreAverage);
        double secondCompetitor = 8.5, thirdCompetitor=7.9;

        String result="";

        if (scoreAverage>secondCompetitor && scoreAverage>thirdCompetitor){
            result="earned";
        } else if ((scoreAverage>secondCompetitor && scoreAverage<thirdCompetitor)|| (scoreAverage<secondCompetitor && scoreAverage>thirdCompetitor)) {
            result="second";
        }else{
            result="third";
        }
        System.out.println("Congratulations you earned " + result + " with a score of: " +scoreAverage );
    }
}
