-- Insertion dans la table Personne
INSERT INTO Personne (idPersonne, nom, dateNaissance, adresse, mail, password)
VALUES (1, 'Admin Principal', '1990-01-01', 'Adresse Admin', 'admin@mail.com', 'admin123');

-- Insertion dans la table Admin (en liant à la personne créée)
INSERT INTO Admin (idAdmin, idPersonne)
VALUES (1, 1);