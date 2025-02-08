import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun NewsScreen() {
    val newsItems = listOf(
        "Breaking: Market hits all-time high",
        "Tech: New smartphone released today",
        "Sports: Local team wins championship",
        "World: Major summit happening now",
        "Abhishek Roushan: Good Man Now a day",
        "Abhishek Roushan: Good Man Now a day",
        "Abhishek Roushan: Good Man Now a day",
        "Abhishek Roushan: Good Man Now a day",
        "Abhishek Roushan: Good Man Now a day"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background).padding(20.dp)
    ) {
        NewsList(newsItems)
    }
}

@Composable
fun NewsList(newsItems: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(newsItems) { news ->
            NewsCard(news)
        }
    }
}

@Composable
fun NewsCard(news: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = news,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Divider(color = Color.Gray.copy(alpha = 0.3f))
            Text(
                text = "Tap to read more...",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNewsScreen() {
    NewsAppTheme {
        NewsScreen()
    }
}
