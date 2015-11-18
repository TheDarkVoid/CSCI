package com.LuminousVector.Graphics.UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.LuminousVector.Utils.Vector2i;

public class UILabel extends UIComponent
{
	public String text;
	private Font font;

	public UILabel(Vector2i position, String text)
	{
		this(position, text, 0xFFFFFF);
	}

	public UILabel(Vector2i position, String text, int col)
	{
		super(new Vector2i(position.x + 12, position.y + 25));
		this.text = text;
		font = new Font("Helvetica", Font.BOLD, 25);
		color = new Color(col);
	}

	public UILabel setColor(Color color)
	{
		this.color = color;
		return this;
	}

	public UILabel setFont(Font font)
	{
		this.font = font;
		return this;
	}

	public void Render(Graphics g)
	{
		g.setFont(font);
		g.setColor(color);
		g.drawString(text, position.x+offset.x, position.y+offset.y);
	}
}