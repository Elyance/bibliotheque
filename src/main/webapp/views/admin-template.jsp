<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin - Tableau de bord</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            min-height: 100vh;
            background: #f8f9fa;
        }
        .sidebar {
            min-width: 220px;
            max-width: 220px;
            background: #343a40;
            color: #fff;
            min-height: 100vh;
            position: fixed;
            top: 0;
            left: 0;
            padding-top: 60px;
        }
        .sidebar a {
            color: #adb5bd;
            text-decoration: none;
            display: block;
            padding: 15px 20px;
            transition: background 0.2s, color 0.2s;
        }
        .sidebar a.active, .sidebar a:hover {
            background: #495057;
            color: #fff;
        }
        .main-content {
            margin-left: 220px;
            padding: 40px 30px;
        }
        .sidebar .sidebar-header {
            font-size: 1.3rem;
            font-weight: bold;
            padding: 20px;
            background: #23272b;
            text-align: center;
        }
        .profile-section {
            padding: 15px 20px;
            background: #23272b;
            margin-bottom: 10px;
        }
        .profile-section img {
            object-fit: cover;
            border: 3px solid #adb5bd;
        }
    </style>
</head>
<body>
<div class="sidebar">
    <div class="sidebar-header">Bibliothèque Admin</div>
    <a href="dashboard" class="active">Tableau de bord</a>
    <a href="adherants">Gestion des adhérents</a>
    <a href="livres">Gestion des livres</a>
    <a href="categories">Gestion des catégories</a>
    <a href="prets">Preter un livre</a>
    <a href="abonnements">Gestion des abonnements</a>
    <a href="logout">Déconnexion</a>
</div>
<div class="main-content">
    <!-- Ici sera inséré le contenu spécifique à chaque page -->
</div>
</body>
</html>
