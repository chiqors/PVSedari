-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2019 at 08:37 AM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sisedari`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id` int(11) NOT NULL,
  `id_transaksi` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `jumlah_beli` int(11) DEFAULT NULL,
  `total_harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id`, `id_transaksi`, `id_menu`, `jumlah_beli`, `total_harga`) VALUES
(1, 1, 18, 2, 16000),
(2, 1, 7, 1, 17500),
(3, 1, 6, 1, 19500),
(4, 2, 13, 1, 10000),
(5, 2, 17, 1, 8000),
(6, 2, 9, 2, 37000),
(7, 2, 10, 1, 7500),
(8, 3, 15, 1, 8000),
(9, 3, 14, 1, 12500),
(10, 3, 3, 1, 15000),
(11, 3, 4, 1, 20000),
(12, 4, 17, 1, 8000),
(13, 4, 5, 1, 22500),
(14, 5, 18, 2, 16000),
(15, 5, 3, 2, 30000),
(16, 6, 8, 1, 15000),
(17, 6, 10, 1, 7500),
(18, 7, 13, 2, 16000),
(19, 7, 6, 1, 19500),
(20, 7, 2, 1, 20000),
(21, 8, 9, 1, 18500),
(22, 8, 2, 1, 20000),
(23, 8, 14, 2, 25000),
(24, 9, 2, 2, 40000),
(25, 10, 9, 1, 18500),
(26, 10, 4, 1, 20000),
(27, 11, 16, 2, 16000),
(28, 11, 7, 2, 35000),
(29, 11, 12, 2, 15000),
(30, 12, 5, 2, 45000),
(31, 12, 3, 1, 15000),
(32, 12, 15, 1, 8000),
(33, 12, 13, 2, 16000),
(58, 13, 16, 1, 8000),
(59, 13, 6, 1, 19500),
(60, 14, 17, 2, 16000),
(61, 14, 15, 1, 8000),
(62, 14, 3, 2, 30000),
(63, 14, 9, 1, 18500),
(64, 15, 15, 1, 8000),
(65, 15, 17, 1, 8000),
(66, 15, 1, 1, 25000),
(67, 15, 10, 2, 15000),
(68, 16, 5, 1, 22500),
(69, 16, 1, 2, 50000),
(70, 16, 10, 3, 22500),
(71, 16, 8, 2, 30000),
(72, 17, 14, 1, 12500),
(73, 17, 3, 1, 15000),
(74, 18, 13, 3, 24000),
(75, 18, 5, 1, 22500),
(76, 18, 6, 1, 19500),
(77, 18, 9, 1, 18500),
(78, 19, 9, 2, 37000),
(79, 20, 14, 2, 25000),
(80, 20, 8, 1, 15000),
(81, 20, 1, 1, 25000),
(82, 21, 7, 1, 17500),
(83, 22, 9, 1, 18500),
(84, 22, 11, 1, 7500),
(85, 23, 15, 2, 16000),
(86, 23, 2, 2, 40000),
(87, 24, 1, 1, 25000),
(88, 24, 3, 1, 15000),
(89, 25, 16, 1, 8000),
(90, 25, 13, 1, 8000),
(91, 25, 4, 1, 20000),
(92, 25, 9, 1, 18500),
(119, 26, 13, 2, 20000),
(120, 26, 10, 3, 22500),
(121, 27, 4, 2, 40000),
(122, 28, 17, 3, 24000),
(123, 28, 16, 3, 24000),
(124, 28, 12, 2, 15000),
(125, 29, 2, 3, 60000),
(126, 29, 14, 2, 25000),
(127, 30, 5, 2, 45000),
(128, 31, 3, 1, 15000),
(129, 32, 18, 3, 24000),
(130, 32, 11, 2, 15000),
(131, 13, 17, 1, 8000),
(132, 30, 1, 2, 50000),
(133, 33, 15, 3, 24000),
(134, 34, 7, 2, 35000),
(135, 35, 10, 2, 15000),
(136, 35, 18, 1, 8000),
(137, 36, 1, 2, 50000),
(138, 36, 12, 1, 7500),
(139, 37, 11, 3, 22500),
(140, 37, 14, 1, 12500),
(141, 37, 8, 2, 30000),
(142, 38, 16, 2, 16000),
(143, 38, 4, 2, 40000),
(144, 38, 13, 2, 20000),
(145, 39, 18, 3, 24000),
(146, 39, 10, 2, 15000),
(147, 40, 15, 2, 16000),
(148, 40, 5, 2, 45000),
(149, 40, 11, 2, 15000),
(150, 41, 14, 3, 37500),
(151, 41, 6, 3, 58500),
(152, 42, 17, 1, 8000),
(153, 42, 2, 1, 20000),
(154, 43, 13, 2, 20000),
(155, 43, 5, 2, 45000),
(156, 43, 10, 2, 7500),
(157, 44, 17, 3, 24000),
(158, 44, 1, 3, 75000),
(159, 45, 15, 2, 16000),
(160, 45, 4, 2, 40000),
(161, 46, 17, 1, 8000),
(162, 46, 3, 1, 15000),
(163, 46, 12, 1, 7500),
(164, 47, 15, 3, 24000),
(165, 47, 7, 3, 52500),
(166, 47, 11, 3, 22500),
(167, 48, 9, 2, 37000),
(168, 48, 13, 2, 20000),
(169, 49, 18, 2, 16000),
(170, 49, 4, 2, 40000),
(171, 49, 11, 2, 15000),
(172, 50, 14, 1, 12500),
(173, 50, 3, 1, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id` int(11) NOT NULL,
  `kategori` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id`, `kategori`) VALUES
(1, 'Makanan'),
(2, 'Minuman'),
(3, 'Tusukan');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `id_kategori` int(11) NOT NULL,
  `nama_menu` varchar(30) NOT NULL,
  `harga` int(11) DEFAULT NULL,
  `stok` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `id_kategori`, `nama_menu`, `harga`, `stok`) VALUES
(1, 1, 'Soto Betawi', 25000, 100),
(2, 1, 'Soto Ayam Sunda', 20000, 95),
(3, 1, 'Soto Boyolali', 15000, 25),
(4, 1, 'Soto Oseng Paru', 20000, 50),
(5, 1, 'Soto Oseng Kikil Pete', 22500, 50),
(6, 1, 'Soto Pedas Rempah', 19500, 30),
(7, 1, 'Soto Betawi Gurih', 17500, 25),
(8, 1, 'Soto Boyolali Kampung', 15000, 20),
(9, 1, 'Tongseng Ayam', 18500, 20),
(10, 3, 'Tusukan Telor Puyuh', 7500, 30),
(11, 3, 'Tusukan Ati Goreng', 7500, 30),
(12, 3, 'Tusukan Usus Ayam Goreng', 7500, 30),
(13, 2, 'Es Kelapa', 10000, 75),
(14, 2, 'Es Shanghai', 12500, 75),
(15, 2, 'Jus Alpukat', 8000, 75),
(16, 2, 'Jus Mangga', 8000, 75),
(17, 2, 'Jus Naga', 8000, 75),
(18, 2, 'Jus Jambu', 8000, 75);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `nip` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(155) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`nip`, `nama`, `username`, `password`) VALUES
('1234567890', 'Administrator', 'admin', md5('admin'));

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `tanggal` datetime DEFAULT NULL,
  `total_harga` int(11) DEFAULT NULL,
  `bayar` int(11) DEFAULT NULL,
  `kembalian` int(11) DEFAULT NULL,
  `kasir` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `tanggal`, `total_harga`, `bayar`, `kembalian`, `kasir`) VALUES
(1, '2019-07-31 10:00:00', 53000, 60000, 7000, '1234567890'),
(2, '2019-07-31 10:20:07', 62500, 65000, 2500, '1234567890'),
(3, '2019-07-31 10:33:14', 55500, 56000, 500, '1234567890'),
(4, '2019-07-31 10:50:15', 30500, 30500, 0, '1234567890'),
(5, '2019-07-31 11:13:27', 46000, 47000, 1000, '1234567890'),
(6, '2019-07-31 11:32:12', 22500, 25000, 2500, '1234567890'),
(7, '2019-07-31 11:45:42', 55500, 55500, 0, '1234567890'),
(8, '2019-07-31 12:15:20', 63500, 64000, 500, '1234567890'),
(9, '2019-07-31 12:26:26', 40000, 40000, 0, '1234567890'),
(10, '2019-07-31 12:35:23', 38500, 50000, 11500, '1234567890'),
(11, '2019-07-31 12:41:23', 66000, 70000, 4000, '1234567890'),
(12, '2019-07-31 13:02:19', 84000, 85000, 1000, '1234567890'),
(13, '2019-07-31 13:27:43', 27500, 28000, 500, '1234567890'),
(14, '2019-07-31 13:49:27', 72500, 75000, 2500, '1234567890'),
(15, '2019-07-31 14:17:27', 56000, 60000, 4000, '1234567890'),
(16, '2019-07-31 14:33:31', 125000, 150000, 25000, '1234567890'),
(17, '2019-07-31 14:46:18', 27500, 30000, 2500, '1234567890'),
(18, '2019-07-31 14:59:49', 84500, 100000, 15500, '1234567890'),
(19, '2019-07-31 15:11:40', 37000, 40000, 3000, '1234567890'),
(20, '2019-07-31 15:24:39', 65000, 65000, 0, '1234567890'),
(21, '2019-07-31 15:40:00', 17500, 20000, 2500, '1234567890'),
(22, '2019-07-31 16:00:16', 26000, 30000, 4000, '1234567890'),
(23, '2019-07-31 16:17:22', 56000, 57000, 1000, '1234567890'),
(24, '2019-07-31 16:34:14', 40000, 50000, 10000, '1234567890'),
(25, '2019-07-31 16:39:22', 54500, 55000, 500, '1234567890'),
(26, '2019-07-31 16:41:31', 42500, 45000, 2500, '1234567890'),
(27, '2019-07-31 16:44:44', 40000, 40000, 0, '1234567890'),
(28, '2019-07-31 16:50:23', 63500, 65000, 1500, '1234567890'),
(29, '2019-07-31 16:56:14', 85000, 100000, 25000, '1234567890'),
(30, '2019-07-31 17:00:00', 95000, 100000, 5000, '1234567890'),
(31, '2019-08-01 08:23:07', 15000, 15000, 0, '1234567890'),
(32, '2019-08-01 08:32:18', 39000, 40000, 1000, '1234567890'),
(33, '2019-08-01 08:37:08', 24000, 25000, 1000, '1234567890'),
(34, '2019-08-01 08:38:32', 35000, 35000, 0, '1234567890'),
(35, '2019-08-01 08:43:19', 23000, 25000, 2000, '1234567890'),
(36, '2019-08-01 08:52:44', 57500, 60000, 2500, '1234567890'),
(37, '2019-08-01 09:06:38', 65000, 70000, 5000, '1234567890'),
(38, '2019-08-01 09:12:35', 76000, 100000, 24000, '1234567890'),
(39, '2019-08-01 09:23:22', 39000, 50000, 11000, '1234567890'),
(40, '2019-08-01 09:37:14', 76000, 80000, 4000, '1234567890'),
(41, '2019-08-01 09:42:20', 96000, 100000, 4000, '1234567890'),
(42, '2019-08-01 09:53:08', 28000, 50000, 22000, '1234567890'),
(43, '2019-07-31 09:57:19', 72500, 75000, 2500, '1234567890'),
(44, '2019-08-01 10:00:45', 99000, 100000, 1000, '1234567890'),
(45, '2019-08-01 10:06:44', 56000, 57000, 1000, '1234567890'),
(46, '2019-08-01 10:14:41', 22500, 25000, 2500, '1234567890'),
(47, '2019-07-31 10:20:00', 99000, 100000, 1000, '1234567890'),
(48, '2019-08-01 10:33:20', 57000, 57000, 0, '1234567890'),
(49, '2019-08-01 10:47:31', 71000, 72000, 1000, '1234567890'),
(50, '2019-08-01 10:49:25', 27500, 50000, 22500, '1234567890');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_menu` (`id_menu`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kasir` (`kasir`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=174;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `detail_transaksi_ibfk_1` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id`),
  ADD CONSTRAINT `detail_transaksi_ibfk_2` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id`);

--
-- Constraints for table `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`kasir`) REFERENCES `pengguna` (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
