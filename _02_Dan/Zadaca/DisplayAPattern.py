""" 
autor:
    Dejan Petrovic
opis:
    Prikazi graficki prikaz neke
    unesene rjeci ili recenice
"""

slova = { "index": "qwertzuiopasdfghjklyxcvbnm., ",
        "Q": ("111 ", "1 1 ", "1 1 ", "1111"),
        "W": ("1  1  1", " 1 1 1 ", "  1 1  ", "  1 1  "),
        "E": ("1111", "111 ", "1   ", "1111"),
        "R": ("1111 ", "1  11", "111  ", "1  11"),
        "T": ( "11111", "  1  ", "  1  ", "  1  "),
        "Z": ( "1111", "  1  ", " 1  ", "1111"),
        "U": ( "1  1", "1  1", "1  1", "1111"),
        "I": ( "111", " 1 ", " 1 ", "111"),
        "O": ( "1111", "1  1", "1  1", "1111"),
        "P": ( "1111", "1  1", "111 ", "1   "),
                
        "A": ( "   1   ", "  1 1  ", " 11111 ", "1     1"),
        "S": ( " 111", "11  ", "  11", "111 "),
        "D": ( "111 ", "1  1", "1  1", "111 "),
        "F": ( "1111", "1   ", "11  ", "1   "),
        "G": ( " 111", "1   ", "1  1", "1111"),
        "H": ( "1  1", "1  1", "1111", "1  1"),
        "J": ( "   1", "   1", "1  1", " 11 " ),
        "K": ( "1 11", "11  ", "1 1 ", "1  1"),
        "L": ( "1  ", "1  ", "1  ", "111"),
                
        "Y": ( "1   1", " 1 1 ", "  1  ", "  1  "),
        "X": ( "1  1", " 11 ", " 11 ", "1  1"),
        "C": ( " 111", "1   ", "1   ", " 111"),
        "V": ( "1     1", " 1   1 ", "  1 1  ", "   1   "),
        "B": ( "111 ", "111 ", "1  1", "111 "),
        "N": ( "1  1", "11 1", "1 11", "1  1"),
        "M": ( "1  1", "1111", "1  1", "1  1"),
        ".": ( "  ", "  ", "11", "11"),
        ",": ( "  ", "  ", " 1", "11"),
        " ": ( "  ", "  ", "  ", "  "),
        };

# funkcija koja uzima rjec ili recenicu od korisnika i
# vraca konvertovanu u velika slova 
def getInput():
    recenica = input("Unesite neku recenicu: ");# ili raw_input...
    
    return recenica.upper()

# funkcija koja uzima recenicu i biblioteku grafickog prikaza slova
# zatim obrce cetiri puta(reda) za svako slovo u recenici
def konstruisiPrikaz(recenica, slova):
    finalniPrikaz = "";
    
    # obrni za svaki red od ukupno cetiri
    # obrni za svako slovo u redu
    for redovi in range(0, 4):
        for kolone in range(len(recenica)):
            # otkrij koje je trenutno slovo iz recenice
            # i otkrij koji je prikaz trenutnog slova
            # na osnovu biblioteke slova
            trenutnoSlovo = recenica[kolone];
            redSlova = slova[trenutnoSlovo][redovi];
            
            # dodaj prikaz trenutnog slova na finalni prikaz ali
            # zamjeni sve 1 u prikazu sa trenutnim slovom
            # i na kraju dodaj odvojeno 
            finalniPrikaz += redSlova.replace("1", trenutnoSlovo);
            finalniPrikaz += " ";

        # kreni novi red
        finalniPrikaz += "\n";
    
    return finalniPrikaz

# glavna main funkcija
def main():
    # prikazi 
    print(konstruisiPrikaz(getInput(), slova));
main()    