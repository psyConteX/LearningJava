# Scramble — 2022-12-05`08:27
# v2023-05-02`06:31

from random import randint

quelle = ["Y.A.", "W.A.", "A.B.", "TMQD", "T.H.", "M.H.", "G.H.", "K.I.", "K.K.", "M.K.", "A.L.", "JFL", "A.Mg.", "NCM", "A.Mr.", "D.M.", "F.N.", "J.O.", "M.P.", "E.P.", "J.R.", "D.R.", "SSD", "N.S.", "M.V."]
ziel = []                               # Ziel-Liste, jetzt noch leer

while len(quelle) > 0 :                 # Iteriere über die Elemente der sortierten Quell-Liste
   iRand = randint(0, len(quelle) - 1)  # Erzeuge Zufallszahl zwischen 0 und der Länge der Quell-Liste - 1
   ziel.insert(0, quelle.pop(iRand))    # Verschiebe zufällig gewähltes Element von Quell-Liste in Ziel-Liste
for i in range(0, len(ziel)) :          # Iteriere über die Ziel-Liste. Die Quell-Liste ist ja jetzt leer
   print(i + 1, '', ziel[i])            # Ausgabe der Elemente in zufälliger Reihenfolge
