<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment</title>
    <style>
        * {
            position: relative;
            box-sizing: border-box;
        }

        table,
        th,
        td {
            border-radius: 10px;
            border: 1px solid;
            border-color: blue;
            width: 60%;
        }

        td,
        th {
            padding: 2px;
            text-align: left;
            border-bottom: 1px;

        }

        tr:hover {
            background-color: #D6EEEE;
        }
    </style>
</head>
</head>
<body>
<form action="Add" method="post" align="center">
    
        <center>  <h1>NCD Risk Assessement Checklist</h1> </center>  

        <table align="center" border="1" height="" width="">
            <tr>
                <th colspan="5" bgcolor="99EB50" align="center"></th>
            </tr>

            <tr style="background-color:skyblue">
                <th>Question</th>
                <th colspan="2">Range </th>
                <th> Circle Any</th>
                <th>Score</th>
            </tr>
            <tr>
                <td rowspan="4">1. What is your age? (in complete years)</td>
                <td colspan="2"> 30-39</td>
                <td>0</td>
                <td rowspan="4">Enter Number:<input type="number" name="age" id=""></td>


            </tr>

            <tr>
                <td colspan="2"> 40-49</td>
                <td>1</td>
            </tr>
            <tr>
                <td colspan="2"> 50-59</td>
                <td>2</td>
            </tr>
            <tr>
                <td colspan="2"> >60</td>
                <td>3</td>
            </tr>
            <tr>
                <td rowspan="3">2. Do you smoke or Consume smokeless product like Gutka or Khaini?</td>
                <td colspan="2"> Never</td>
                <td>0</td>
                <td rowspan="3">Enter Number:<input type="number" name="smoke" id=""></td>

            </tr>

            <tr>
                <td colspan="2"> Used to consume in past/ sometime now</td>
                <td> 1</td>
            </tr>
            <tr>
                <td colspan="2"> Daily</td>
                <td>2</td>
            </tr>


            <tr>
                <td rowspan="2">3. Do you consume alcohol daily?</td>
                <td colspan="2"> Yes</td>
                <td>0</td>
                <td rowspan="2">Enter Number: <input type="number" name="alcohol" id=""></td>

            </tr>
            <tr>
                <td colspan="2"> No</td>
                <td>1</td>
            </tr>

            <tr>

                <td rowspan="4">4. Measurement of waist in (Cm)</td>
                <td style="background-color:lightpink">Female</td>
                <td style="background-color:lightpink">Male</td>
                <td></td>
                <td rowspan="4">Enter Number:<input type="number" name="waist" id=""></td>
            </tr>
            <tr>
                <td> 80 cm or less</td>
                <td> 90 cm or less</td>
                <td>0</td>
            </tr>
            <tr>
                <td> 81-90 cm</td>
                <td> 90-100 cm</td>
                <td> 1</td>
            </tr>
            <tr>
                <td> More than 90 cm</td>
                <td> More than 100 cm</td>
                <td>2</td>
            </tr>


            <tr>

            <tr>
                <td rowspan="2">5. Do you undertake any physical activities for a minimum of 150 minutes a week?</td>
                <td colspan="2"> At least 150 minutes a week</td>
                <td>0</td>

                <td rowspan="2">Enter Number:<input type="number" name="physical" id=""></td>

            </tr>
            <tr>
                <td colspan="2"> Less than 150 min a week</td>
                <td>1</td>
            </tr>


            <tr>
                <td rowspan="2">6. Do you have a family history (any one of your parents or siblings) of high blood
                    pressure, diabetes and heart disease?</td>
                <td colspan="2"> No</td>
                <td>0</td>


                <td rowspan="2">Enter Number:<input type="number" name="Family" id=""></td>

            </tr>
            <td colspan="2"> Yes</td>
            <td>2</td>
            </tr>

            <tr style="background-color:rgb(228, 209, 105)">
                <td colspan="4" align="left">Total Score :</td>
               <td> <input type="submit" value="Add" align="center"></td>

            </tr>

        </table>
        

    </form>
</body>

</html>