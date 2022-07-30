def timeConversion(s):
    # Write your code here
    time = datetime.datetime.strptime(s, '%I:%M:%S%p')
    timeStr = time.strftime('%H:%M:%S')
    return timeStr