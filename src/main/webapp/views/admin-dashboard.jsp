<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin - Tableau de bord</title>
    <link rel="stylesheet" href="/static/css/admin-template.css">
</head>
<body>
<div class="sidebar">
    <div class="sidebar-header">Bibliothèque Admin</div>
    <div class="profile-section text-center mb-4">
        <img src="/static/images/user.png" alt="Photo de profil" class="rounded-circle mb-2" width="90" height="90" style="object-fit:cover; border:3px solid #adb5bd;">
        <div style="font-size:1rem; color:#fff;">Admin</div>
    </div>
    <a href="/admin/dashboard" class="active">Tableau de bord</a>
    <a href="/admin/adherants">Gestion des adhérents</a>
    <a href="/admin/livres">Gestion des livres</a>
    <a href="/admin/categories">Gestion des catégories</a>
    <a href="/admin/prets">Gestion des prêts</a>
    <a href="/admin/abonnements">Gestion des abonnements</a>
    <a href="/admin/logout">Déconnexion</a>
</div>
<div class="main-content">
    <!-- Ici sera inséré le contenu spécifique à chaque page -->
    
</div>
</body>
</html>
