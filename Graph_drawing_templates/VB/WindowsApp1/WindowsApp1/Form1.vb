'@Hoque, Aug/29/2017: A VB based graphics template for students of CSCI 4631/5631  
Public Class Form1
    Dim myDrawArea As Bitmap
    Dim g As Graphics
    Public Sub New()
        ' This call is required by the designer
        InitializeComponent()
        myDrawArea = New Bitmap(PictureBox1.Size.Width, PictureBox1.Size.Height)
        PictureBox1.Image = myDrawArea
    End Sub
    Private Sub DrawLineButton_Click(sender As Object, e As EventArgs) Handles DrawLineButton.Click

        g.DrawLine(Pens.Blue, CInt(Line_x1.Text), CInt(Line_y1.Text), CInt(Line_x2.Text), CInt(Line_y2.Text))
        PictureBox1.Image = myDrawArea

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        g.Dispose()
        Application.Exit()
    End Sub
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles Me.Load
        'g = PictureBox1.CreateGraphics()
        g = Graphics.FromImage(myDrawArea)
        g.Clear(Color.White) ' make the initial background white
    End Sub
    Private Sub DrawCircleButton_Click(sender As Object, e As EventArgs) Handles DrawCircleButton.Click
        Dim x, y, r As Integer
        x = Circle_x.Text
        y = Circle_y.Text
        r = Circle_r.Text
        g.DrawEllipse(Pens.DarkRed, x - r, y - r, 2 * r, 2 * r)
        PictureBox1.Image = myDrawArea
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim pixcolor As Color
        pixcolor = myDrawArea.GetPixel(CInt(pixx1.Text), CInt(pixy1.Text)) ' read pixel color from (x1, y1)
        myDrawArea.setpixel(CInt(pixx2.Text), CInt(pixy2.Text), pixcolor)  ' write pixel with same color at (x2, y2)
        PictureBox1.Image = myDrawArea
    End Sub


End Class
