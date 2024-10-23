import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner saisir = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int choix;
        do {
            System.out.println("1 - Exercice n°1");
            System.out.println("2 - Exercice n°2");
            System.out.println("3 - Exercice n°3");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = saisir.nextInt();
        } while (choix > 3);

        switch (choix)
        {

            case 0:
                System.out.println("Fin du programme");
                break;

            case 1:
            float nbKms;
            float volume;
            float poidKilos;
            float fraisPort;
            float fraisVolume = 0;
            float fraisPoids = 0;
            float fraisKms = 0;

            do {
                System.out.print("Nombre de Kms: ");
                nbKms = saisir.nextFloat();
            } while (nbKms < 0);
            do {
                System.out.print("Volumes en M3: ");
                volume = saisir.nextFloat();
            } while (volume < 0);
            do {
                System.out.print("Poids en kilos: ");
                poidKilos = saisir.nextFloat();
            } while (poidKilos < 0);

            if (poidKilos > 60) {
                fraisPoids = poidKilos - 60;
            }

            if (volume >= 1) {
                fraisVolume = 20;
            }

            if (nbKms > 100) {
                fraisKms = (nbKms - 100) / 2;
            }

            fraisPort = 50 + fraisPoids + fraisKms + fraisVolume;

            System.out.println("Frais de port: " + fraisPort );

            break;

            case 2:

                double recetteAnuelle=31;
                int nombreAnnee=0;
                double investissement=150;
                double recetteTotal=0;

                while (recetteTotal < 150)
                {
                    recetteTotal = recetteTotal + recetteAnuelle;
                    investissement=investissement - recetteAnuelle;
                    nombreAnnee++;
                    System.out.println("Année " + nombreAnnee + " Recette : " + decimalFormat.format(recetteAnuelle) + ", Investissement : " + decimalFormat.format(investissement));
                    recetteAnuelle = recetteAnuelle * 0.8;

                }

                System.out.println("Le stade devient bénéficiaire après " + nombreAnnee + " années.");
                break;

                case 3:
                    double nbMise;
                    double gains=50;
                    int nb1;
                    int nb2;
                    int nb3;
                    Random rand = new Random();

                        System.out.print("Votre mise: ");
                        nbMise = saisir.nextFloat();

                    while (gains>0) {
                        nb1 = rand.nextInt(1, 100);
                        nb2 = rand.nextInt(1, 100);
                        nb3 = rand.nextInt(1, 100);
                        System.out.println("Tirage: " + nb1 + " - " + nb2 + " - " + nb3);

                        if (nb1 == nb2 && nb1 == nb3) {
                            gains= nbMise+ nbMise * 3;
                        }

                        else if (nb2 == nb3 || nb1 == nb2 || nb3 == nb1) {
                            gains =nbMise+nbMise * 2;
                        }
                        else
                            gains =gains-nbMise  ;
                        System.out.println("Votre gains : "+ gains );
                    }
                    System.out.println("Vous avez perdu : jeu terminé");
                    break;

        }
    }
}
