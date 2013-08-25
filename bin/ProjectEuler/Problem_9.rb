(1..1000).each do |a|
	(a..1000).each do |b|
		c=1000-a-b
		if (c**2==a**2+b**2)&&(c>b)
			print result = c*b*a
		end
	end
end