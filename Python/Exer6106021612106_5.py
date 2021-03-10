#millisecond to d/h/m/s/ms
milli=(int(input("Input milliseconds: ")))
day=milli // 86400000
hour=milli % 86400000 // 3600000
minute=milli % 86400000 % 3600000 // 60000
second=milli % 86400000 % 3600000 % 60000 // 1000
millisec=milli % 86400000 % 3600000 % 60000 % 1000
print("Results = ", day, "day", hour, "hour", minute, "minute", second, "second", millisec, "millisec")
