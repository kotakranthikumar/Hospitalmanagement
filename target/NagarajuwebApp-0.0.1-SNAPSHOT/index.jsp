<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KRANTHI</title>
    </head>
    <body>
     KRANTHI</br>
     
     <button type="button">ADMIN </button></br></br>
        <button type="button">RECEPTNST</button></br></br>
        <button type="button">DOCTOR</button></br></br>
        
</body>
       <!DOCTYPE html>
<html>
 <script>
        function redirectToURL(urlpattern) {
            window.location.href = urlpattern;
        }
    </script>
<head>
    <title>Services Table Example</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        
        tbody tr:hover {
            background-color: #f5f5f5;
        }
        
        .button {
            padding: 6px 12px;
            border: none;
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }
        
        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Service Name</th>
              
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td> FOR ADMIN</td>
                
                <td><button class="button" onclick="redirectToURL('Admin')">CLICK HERE</button></td>
            </tr>
            <tr>
                <td>FOR RECEPTNEST</td>
                
                <td><button class="button" onclick="redirectToURL('Receptionest')">CLICK HERE</button></td>
            </tr>
            <tr>
                <td>FOR DOCTORS</td>
                
                <td><button class="button" onclick="redirectToURL('Doc')">CLICK HERE</button></td>
            </tr>
        </tbody>
    </table>
</body>
        <div class="footnote">
        <p><a href="#ref1" id="footnote1">[1]</a> THIS IS KRANTHI KUMAR APPLIYCATION</p>
    </div>
</html>
       
    </body>
</html>
