$a = [2]
result=2
def isPrime(n)
	for j in $a
		if n%j==0
			return false
		end
	end
	return true
end

for i in (3..2000000)
	if isPrime(i)
		$a.push(i)
		result+=i
	end
end
print result