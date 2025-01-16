from pytube import YouTube
from pytube.exceptions import VideoUnavailable, PytubeError

# Take input link from user
link = input("Enter a link to download video: ")

# Check if it's a Shorts link and convert it to a regular video URL
if '/shorts/' in link:
    link = link.replace('/shorts/', '/watch?v=')

try:
    # Initialize YouTube object
    yt = YouTube(link)

    # Get the highest resolution stream available
    downloader = yt.streams.get_highest_resolution()

    # Inform user that download is starting
    print("Downloading video...")

    # Download the video and save with the specified filename
    downloader.download(filename="videoD.mp4")

    # Inform user that download is successful
    print("Video downloaded successfully!")

except VideoUnavailable:
    print("Error: Video is unavailable. It may have been removed or blocked.")
except PytubeError as e:
    print(f"An error occurred: {e}")
except Exception as e:
    print(f"An unexpected error occurred: {e}")
