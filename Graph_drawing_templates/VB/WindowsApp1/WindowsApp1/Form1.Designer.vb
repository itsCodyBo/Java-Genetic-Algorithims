<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.DrawLineButton = New System.Windows.Forms.Button()
        Me.DrawCircleButton = New System.Windows.Forms.Button()
        Me.Line_x1 = New System.Windows.Forms.TextBox()
        Me.Line_y1 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Line_y2 = New System.Windows.Forms.TextBox()
        Me.Line_x2 = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Circle_y = New System.Windows.Forms.TextBox()
        Me.Circle_x = New System.Windows.Forms.TextBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Circle_r = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.pixy1 = New System.Windows.Forms.TextBox()
        Me.pixx1 = New System.Windows.Forms.TextBox()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.Label11 = New System.Windows.Forms.Label()
        Me.Label12 = New System.Windows.Forms.Label()
        Me.Label13 = New System.Windows.Forms.Label()
        Me.pixy2 = New System.Windows.Forms.TextBox()
        Me.pixx2 = New System.Windows.Forms.TextBox()
        Me.Label14 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'DrawLineButton
        '
        Me.DrawLineButton.Location = New System.Drawing.Point(540, 430)
        Me.DrawLineButton.Name = "DrawLineButton"
        Me.DrawLineButton.Size = New System.Drawing.Size(101, 23)
        Me.DrawLineButton.TabIndex = 0
        Me.DrawLineButton.Text = "DrawLine"
        Me.DrawLineButton.UseVisualStyleBackColor = True
        '
        'DrawCircleButton
        '
        Me.DrawCircleButton.Location = New System.Drawing.Point(540, 472)
        Me.DrawCircleButton.Name = "DrawCircleButton"
        Me.DrawCircleButton.Size = New System.Drawing.Size(101, 23)
        Me.DrawCircleButton.TabIndex = 2
        Me.DrawCircleButton.Text = "DrawCircle"
        Me.DrawCircleButton.UseVisualStyleBackColor = True
        '
        'Line_x1
        '
        Me.Line_x1.Location = New System.Drawing.Point(357, 432)
        Me.Line_x1.Name = "Line_x1"
        Me.Line_x1.Size = New System.Drawing.Size(31, 20)
        Me.Line_x1.TabIndex = 3
        Me.Line_x1.Text = "10"
        Me.Line_x1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Line_y1
        '
        Me.Line_y1.Location = New System.Drawing.Point(394, 432)
        Me.Line_y1.Name = "Line_y1"
        Me.Line_y1.Size = New System.Drawing.Size(31, 20)
        Me.Line_y1.TabIndex = 4
        Me.Line_y1.Text = "5"
        Me.Line_y1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(361, 416)
        Me.Label1.Name = "Label1"
        Me.Label1.RightToLeft = System.Windows.Forms.RightToLeft.No
        Me.Label1.Size = New System.Drawing.Size(18, 13)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "x1"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(397, 416)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(18, 13)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "y1"
        Me.Label2.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(503, 415)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(18, 13)
        Me.Label3.TabIndex = 10
        Me.Label3.Text = "y2"
        Me.Label3.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(463, 415)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(18, 13)
        Me.Label4.TabIndex = 9
        Me.Label4.Text = "x2"
        Me.Label4.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Line_y2
        '
        Me.Line_y2.Location = New System.Drawing.Point(499, 432)
        Me.Line_y2.Name = "Line_y2"
        Me.Line_y2.Size = New System.Drawing.Size(34, 20)
        Me.Line_y2.TabIndex = 8
        Me.Line_y2.Text = "220"
        Me.Line_y2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Line_x2
        '
        Me.Line_x2.Location = New System.Drawing.Point(459, 432)
        Me.Line_x2.Name = "Line_x2"
        Me.Line_x2.Size = New System.Drawing.Size(34, 20)
        Me.Line_x2.TabIndex = 7
        Me.Line_x2.Text = "110"
        Me.Line_x2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Button1.Location = New System.Drawing.Point(540, 546)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(101, 23)
        Me.Button1.TabIndex = 11
        Me.Button1.Text = "Exit"
        Me.Button1.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(13, 13)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(628, 397)
        Me.PictureBox1.TabIndex = 12
        Me.PictureBox1.TabStop = False
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(470, 458)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(12, 13)
        Me.Label5.TabIndex = 16
        Me.Label5.Text = "y"
        Me.Label5.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(434, 458)
        Me.Label6.Name = "Label6"
        Me.Label6.RightToLeft = System.Windows.Forms.RightToLeft.No
        Me.Label6.Size = New System.Drawing.Size(12, 13)
        Me.Label6.TabIndex = 15
        Me.Label6.Text = "x"
        Me.Label6.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Circle_y
        '
        Me.Circle_y.Location = New System.Drawing.Point(465, 472)
        Me.Circle_y.Name = "Circle_y"
        Me.Circle_y.Size = New System.Drawing.Size(31, 20)
        Me.Circle_y.TabIndex = 14
        Me.Circle_y.Text = "120"
        Me.Circle_y.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Circle_x
        '
        Me.Circle_x.Location = New System.Drawing.Point(428, 472)
        Me.Circle_x.Name = "Circle_x"
        Me.Circle_x.Size = New System.Drawing.Size(31, 20)
        Me.Circle_x.TabIndex = 13
        Me.Circle_x.Text = "150"
        Me.Circle_x.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(509, 458)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(10, 13)
        Me.Label7.TabIndex = 18
        Me.Label7.Text = "r"
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Circle_r
        '
        Me.Circle_r.Location = New System.Drawing.Point(501, 472)
        Me.Circle_r.Name = "Circle_r"
        Me.Circle_r.Size = New System.Drawing.Size(31, 20)
        Me.Circle_r.TabIndex = 17
        Me.Circle_r.Text = "90"
        Me.Circle_r.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(205, 507)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(18, 13)
        Me.Label8.TabIndex = 23
        Me.Label8.Text = "y1"
        Me.Label8.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(168, 507)
        Me.Label9.Name = "Label9"
        Me.Label9.RightToLeft = System.Windows.Forms.RightToLeft.No
        Me.Label9.Size = New System.Drawing.Size(18, 13)
        Me.Label9.TabIndex = 22
        Me.Label9.Text = "x1"
        Me.Label9.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'pixy1
        '
        Me.pixy1.Location = New System.Drawing.Point(199, 523)
        Me.pixy1.Name = "pixy1"
        Me.pixy1.Size = New System.Drawing.Size(31, 20)
        Me.pixy1.TabIndex = 21
        Me.pixy1.Text = "5"
        Me.pixy1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'pixx1
        '
        Me.pixx1.Location = New System.Drawing.Point(162, 523)
        Me.pixx1.Name = "pixx1"
        Me.pixx1.Size = New System.Drawing.Size(31, 20)
        Me.pixx1.TabIndex = 20
        Me.pixx1.Text = "10"
        Me.pixx1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(22, 522)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(101, 23)
        Me.Button2.TabIndex = 19
        Me.Button2.Text = "Get Pixel Color"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(129, 527)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(27, 13)
        Me.Label10.TabIndex = 24
        Me.Label10.Text = "from"
        Me.Label10.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label11
        '
        Me.Label11.AutoSize = True
        Me.Label11.Location = New System.Drawing.Point(236, 526)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(178, 13)
        Me.Label11.TabIndex = 25
        Me.Label11.Text = "and draw pixel with same color here:"
        Me.Label11.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label12
        '
        Me.Label12.AutoSize = True
        Me.Label12.Location = New System.Drawing.Point(458, 507)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(18, 13)
        Me.Label12.TabIndex = 29
        Me.Label12.Text = "y2"
        Me.Label12.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Label13
        '
        Me.Label13.AutoSize = True
        Me.Label13.Location = New System.Drawing.Point(421, 507)
        Me.Label13.Name = "Label13"
        Me.Label13.RightToLeft = System.Windows.Forms.RightToLeft.No
        Me.Label13.Size = New System.Drawing.Size(18, 13)
        Me.Label13.TabIndex = 28
        Me.Label13.Text = "x2"
        Me.Label13.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'pixy2
        '
        Me.pixy2.Location = New System.Drawing.Point(452, 523)
        Me.pixy2.Name = "pixy2"
        Me.pixy2.Size = New System.Drawing.Size(31, 20)
        Me.pixy2.TabIndex = 27
        Me.pixy2.Text = "140"
        Me.pixy2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'pixx2
        '
        Me.pixx2.Location = New System.Drawing.Point(415, 523)
        Me.pixx2.Name = "pixx2"
        Me.pixx2.Size = New System.Drawing.Size(31, 20)
        Me.pixx2.TabIndex = 26
        Me.pixx2.Text = "160"
        Me.pixx2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Location = New System.Drawing.Point(437, 435)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(16, 13)
        Me.Label14.TabIndex = 30
        Me.Label14.Text = "to"
        Me.Label14.TextAlign = System.Drawing.ContentAlignment.TopRight
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(653, 581)
        Me.Controls.Add(Me.Label14)
        Me.Controls.Add(Me.Label12)
        Me.Controls.Add(Me.Label13)
        Me.Controls.Add(Me.pixy2)
        Me.Controls.Add(Me.pixx2)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.pixy1)
        Me.Controls.Add(Me.pixx1)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Circle_r)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Circle_y)
        Me.Controls.Add(Me.Circle_x)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Line_y2)
        Me.Controls.Add(Me.Line_x2)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Line_y1)
        Me.Controls.Add(Me.Line_x1)
        Me.Controls.Add(Me.DrawCircleButton)
        Me.Controls.Add(Me.DrawLineButton)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents DrawLineButton As Button
    Friend WithEvents DrawCircleButton As Button
    Friend WithEvents Line_x1 As TextBox
    Friend WithEvents Line_y1 As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Line_y2 As TextBox
    Friend WithEvents Line_x2 As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Circle_y As TextBox
    Friend WithEvents Circle_x As TextBox
    Friend WithEvents Label7 As Label
    Friend WithEvents Circle_r As TextBox
    Friend WithEvents Label8 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents pixy1 As TextBox
    Friend WithEvents pixx1 As TextBox
    Friend WithEvents Button2 As Button
    Friend WithEvents Label10 As Label
    Friend WithEvents Label11 As Label
    Friend WithEvents Label12 As Label
    Friend WithEvents Label13 As Label
    Friend WithEvents pixy2 As TextBox
    Friend WithEvents pixx2 As TextBox
    Friend WithEvents Label14 As Label
End Class
